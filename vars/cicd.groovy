def newgit(repo)
{
  git  "${repo}"
}
def newmaven()
{
  sh 'mvn package'
}
def newdeploy(jobname,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@172.31.46.98:/var/lib/tomcat9/webapps/${context}.war"
}
