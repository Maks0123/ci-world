import com.corp.project.mgmt.libs.*


/* Stage for package chart
 */
def BuildImage(String project, String version, String stageName='') {
    stage(stageName ? stageName : 'Package chart') {
        dir(project) {
            String comm
            println('Package chart... ')

            comm = """helm package ${project} --version ${version} \\
                    |curl -X PUT -T "${project}/${project}-${version}" https://lab-bucket-nure.s3.amazonaws.com""".stripMargin()
            sh(comm)
        }
    }
}


