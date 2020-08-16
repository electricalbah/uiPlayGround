FROM payara/server-full

# Initialize the configurable environment variables
ENV HOME_DIR=/opt/payara\
    PAYARA_DIR=/opt/payara/appserver\
    SCRIPT_DIR=/opt/payara/scripts\
    CONFIG_DIR=/opt/payara/config\
    DEPLOY_DIR=/opt/payara/deployments\
    PASSWORD_FILE=/opt/payara/passwordFile\
    # Payara Server Domain options
    DOMAIN_NAME=production\
    ADMIN_USER=admin\
    ADMIN_PASSWORD=admin \
    # Build info
    WAR_FILE=/Users/mamadu.bah/workspace/Java/z_GitHubProjects/uiPlayGround/deploy/uiPlayGround-1.0-SNAPSHOT.war

COPY $WAR_FILE $DEPLOY_DIR


