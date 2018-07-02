pipeline {
  agent none
  stages {
    stage('build') {
      parallel {
        stage('build') {
          agent any
          steps {
            echo 'hello'
            pwd(tmp: true)
          }
        }
        stage('test') {
          steps {
            timeout(time: 40)
          }
        }
      }
    }
    stage('deploy') {
      steps {
        echo 'op'
      }
    }
  }
}