pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile.txt'
    }

  }
  stages {
    stage('my-stage-1') {
      steps {
        sh '''echo "hello how are you" $(date)
'''
      }
    }
  }
}