def call(String imageName) {
  docker.withRegistry('https://index.docker.io/v1/', 'docker-cred'){
    sh '''
    echo "push to repo"
    docker push imageName
