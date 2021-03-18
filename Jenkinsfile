pipeline {

    agent any

    stages {
        stage('build') {
            steps {
                sh '${WORKSPACE}/ParentModule/gradlew -p ${WORKSPACE}/ParentModule clean build'
            }
        }
        stage('check1') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
