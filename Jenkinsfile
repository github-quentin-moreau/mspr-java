    pipeline {
        agent any
        stages {
            stage('Clean Web Site'){
                steps{
                    echo 'Clean ... 🧹'
                    sh 'rm -rf /Users/qmoreau/.jenkins/workspace/mspr_java_master/web/*'
                    echo 'Clean Ok ✅'
                }
            }
            stage('Build Project') {
                steps {
                    withAnt(installation: 'ant') {
                        echo 'Building ...🔨'
                        sh 'ant'
                        echo 'Building Successful ✅'
                    }
                }
            }
            stage('Build WebSite') {
                steps {
                    echo 'Java version ='
                    sh 'java --version'
                    echo 'Build Web Site ...🔨'
                    sh 'java -jar ./dist/MSPRJAVA.jar'
                    echo 'Build Web Site Successful ✅'
                }
            }
            stage('Copy WebSite') {
                steps{
                    echo 'Copy the web site ...💾'
                    sh 'rm -rf /Applications/XAMPP/htdocs/WebSiteJava/web'
                    sh 'cp -R /Users/qmoreau/.jenkins/workspace/mspr_java_master/web /Applications/XAMPP/htdocs/WebSiteJava '
                    sh 'cp -R /Users/qmoreau/.jenkins/workspace/mspr_java_master/list /Applications/XAMPP/htdocs/WebSiteJava '
                    echo 'Copy of the Web Site Successful ✅'
                }
            }
        }
    }
