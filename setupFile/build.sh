#!/bin/bash

# Check and install JDK
java_version=$(java -version 2>&1 | awk -F '"' '/version/ {print $2}')
if [[ -z "$java_version" ]]; then
    echo -e "\e[32mInstalling JDK...\e[0m"
    sudo apt-get install default-jdk -y
else
    echo -e "\e[33mJDK is already installed.\e[0m"
fi

# Check and install Apache Tomcat
tomcat_version="9.0.50"  # Specify the version of Apache Tomcat to install
tomcat_path="/var/lib/tomcat9"

if [[ ! -d "$tomcat_path" ]]; then
    echo -e "\e[32mInstalling Apache Tomcat...\e[0m"
    sudo apt-get install -y tomcat9
else
    echo -e "\e[33mApache Tomcat is already installed.\e[0m"
fi

# Check and install curl
curl_path=$(which curl)
if [[ -z "$curl_path" ]]; then
    echo -e "\e[32mInstalling curl...\e[0m"
    sudo apt-get install curl -y
else
    echo -e "\e[33mcurl is already installed.\e[0m"
fi

# Check and install SQL Server
sqlcmd_path="/opt/mssql-tools/bin/sqlcmd"
if [[ ! -f "$sqlcmd_path" ]]; then
    echo -e "\e[32mInstalling SQL Server...\e[0m"

    # Import the public repository GPG keys
    wget -qO- https://packages.microsoft.com/keys/microsoft.asc | sudo apt-key add -

    # Register the Microsoft SQL Server Ubuntu repository
    curl https://packages.microsoft.com/config/ubuntu/20.04/mssql-server-2019.list | sudo tee /etc/apt/sources.list.d/mssql-server.list

    # Update the package list
    sudo apt-get update

    # Install SQL Server
    echo -e "\e[32mInstalling SQL Server...\e[0m"
    sudo apt-get install -y mssql-server 

    # Configure SQL Server
    echo -e "\e[32mConfiguring SQL Server...\e[0m"
    sudo /opt/mssql/bin/mssql-conf setup

    # Install SQL Command Line Tools
    echo -e "\e[32mInstalling SQL Command Line Tools (sqlcmd)...\e[0m"
    curl https://packages.microsoft.com/config/ubuntu/20.04/prod.list | sudo tee /etc/apt/sources.list.d/msprod.list
    sudo apt-get update
    sudo apt-get install -y mssql-tools unixodbc-dev 

    # Add SQL Command Line Tools to the path
    echo 'export PATH="$PATH:/opt/mssql-tools/bin"' >> ~/.bashrc
    source ~/.bashrc
    sudo systemctl restart mssql-server
    echo -e "\e[32mSQL Command Line Tools (sqlcmd) installed and configured successfully!\e[0m"

else
    echo -e "\e[33mSQL Server and SQL Command Line Tools (sqlcmd) are already installed.\e[0m"
fi

# Check and install Git
git_path=$(which git)
if [[ -z "$git_path" ]]; then
    echo -e "\e[32mInstalling Git...\e[0m"
    sudo apt-get install git -y
else
    echo -e "\e[33mGit is already installed.\e[0m"
fi

# Check if the project directory already exists
project_dir="DBS401Web"
if [[ -d "$project_dir" ]]; then
    echo -e "\e[33mProject directory already exists. Skipping cloning...\e[0m"
else
    # Clone the project from GitHub
    echo -e "\e[32mCloning the project from GitHub...\e[0m"
    git clone https://github.com/4n207/DBS401Web.git
fi

# Run script.sql to create the database
echo -e "\e[32mRunning script.sql to create the database...\e[0m"
cd $project_dir/Database
sqlcmd -U sa -P Password123@ -i script.sql

# Check if NetBeans is installed
if [[ -x "$(command -v netbeans)" ]]; then
    echo -e "\e[33mNetBeans is already installed.\e[0m"
else
    echo -e "\e[32mNetBeans is not installed. Installing...\e[0m"
    sudo snap install netbeans --classic
fi

echo -e "\e[32mClose terminal and run script again to build database.\e[0m"
