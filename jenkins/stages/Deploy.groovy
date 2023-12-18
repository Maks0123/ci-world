/* Stage for package chart
 */
def Deploy(String project, String stageName='') {
    stage(stageName ? stageName : 'Deploy') {
        println('Deploy... ')
        comm = "sleep 15"
        sh(comm)
    }
}

