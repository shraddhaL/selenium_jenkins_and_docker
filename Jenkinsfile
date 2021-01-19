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
			          //    withCredentials([usernamePassword( credentialsId: 'docker-hub-credentials', usernameVariable: 'shraddhal', passwordVariable: 'dockerhub1234')]) {
					
			docker.withRegistry('https://hub.docker.com', 'shraddhal/dockerhub1234') {
					sh "docker login -u shraddhal -p dockerhub1234"
					app.push("${BUILD_NUMBER}")
					app.push("latest")
				//	}
			
			
			
			/*env.   docker.withRegistry('https://registry.hub.docker.com', 'shraddhal/seleniumtest') {
			        	app.push("${BUILD_NUMBER}")
			            app.push("latest")
			        }
			*/
			
	//		 withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
        //     sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
        //     sh 'docker push ${dockerTag}
			
			/*// code placeholder
stage('Push image') {
/* Finally, we'll push the image with two tags:
* First, the incremental build number from Jenkins
* Second, the 'latest' tag. */

	
			
                }
            }
        }        
    }
}
}
