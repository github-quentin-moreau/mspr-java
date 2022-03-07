pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building ...'
                echo 'Java version ='
                sh 'java --version'
                echo 'Build Web Site ...'
                sh 'java -jar ./dist/MSPRJAVA.jar'
                echo 'Copy the web site ...'
                sh 'cp -R /Users/qmoreau/.jenkins/workspace/mspr_java_master/web /Applications/XAMPP/htdocs/WebSiteJava '
            }
        }
    }
}
