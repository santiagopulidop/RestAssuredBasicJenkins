pipeline{
    agent any
    stages{
        stage("Clone Repo"){
            steps{
                "git clone https://github.com/santiagopulidop/RestAssuredBasicJenkins"
            }
        }
        stage("Build"){
            steps{
               sh "mvn clean install"
            }
        }
        stage("Test"){
            steps{
                sh "mvn test"
            }

        }
    }
}
