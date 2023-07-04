pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
withMaven(maven : 'maven_3_9_3'){
                echo 'Building..'
}
        }
}
        stage('Test') {
            steps {
withMaven(maven : 'maven_3_9_3'){
                echo 'Testing..'
}  
 
}
        }
        stage('Deploy') {
            steps {

  withMaven(maven : 'maven_3_9_3'){
                echo 'Deploying....'
  }
        }
    }
}
}
