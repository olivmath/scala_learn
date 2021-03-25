# Install java: 8 or 11
apt-get install openjdk-8-jre -y

#  Install sbt: 1.4.X
echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list
curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add
apt-get update -y
apt-get install sbt -y

# Install scala: 2.13.X
sudo apt-get install scala -y


