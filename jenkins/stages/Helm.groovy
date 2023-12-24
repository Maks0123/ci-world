/* Stage for package chart
 */
def HelmPackage(String project, String version, String stageName='') {
    stage(stageName ? stageName : 'Package chart') {
        dir(project) {
            String comm
            println('Package chart... ')

            comm = """helm package ${project} --version ${version}
                    |curl -X PUT -T "${project}/${project}-${version}" https://lab-bucket-nure.s3.amazonaws.com/${project}/""".stripMargin()
            sh(comm)
        }
    }
}


