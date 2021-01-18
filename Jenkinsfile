pipeline {
     agent any
	 tools {
        maven 'Maven' 
    }
	 environment {
        containerName = "shraddhal/seleniumtest"
        container_version = "1.0.0.${BUILD_ID}"
        dockerTag = "${containerName}:${container_version}"
    }
    stages { 	
        stage('Build Jar') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Build Image') {
            steps {
                script {
                	app = docker.build("shraddhal/seleniumtest")
                }
            }
        }
        stage('Push Image') {
            steps {
                script {
			        docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
			        	app.push("${BUILD_NUMBER}")
			            app.push("latest")
			        }
                }
            }
        }        
    }
}
