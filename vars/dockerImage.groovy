def call(String imageName){
sh """
echo "building docker image"
cd python-jenkins-argocd-k8s
docker build -t ${imageName} .
"""
}
