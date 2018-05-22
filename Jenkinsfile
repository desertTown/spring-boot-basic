pipeline {
    agent any
    environment {
        NameSpace='JOEL-EVAN'
    }

    stages {
        stage('Sonar') {
            steps {
                sh 'echo "ccc"'
            }
        }
        stage('Checkout') {
            steps {
                git poll: true, url: 'https://github.com/desertTown/spring-boot-basic.git'
            }
        }
        stage('Deploy') {
            steps {
                sh 'whoami'
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh "ssh -i $keyfile ubuntu@172.31.12.139 mkdir -p /home/ubuntu/works/$NameSpace"
                    sh "ssh -i $keyfile ubuntu@172.31.12.139 'ls /home/ubuntu/works/$NameSpace'"
                    sh "ssh -i $keyfile ubuntu@172.31.12.139 'kill -9 \$(lsof -t -i:8080) 2>&1 &'"
                    sh "ssh -i $keyfile ubuntu@172.31.12.139 'nohup java -jar -Dserver.port=8888 /home/ubuntu/works/$NameSpace/demo.jar > demo.log 2>&1 &'"
                }
            }
        }
        stage('Curl') {
            steps {
                sh "curl http://ec2-52-80-133-153.cn-north-1.compute.amazonaws.com.cn:8717/fizz-buzz/4"
            }
        }
    }
}