/* Stage for package chart
 */
def UnitTetst(String project, String stageName='') {
    stage(stageName ? stageName : 'UnitTetst') {
        println('UnnitTetst... ')
        comm = "sleep 10"
        sh(comm)
    }
}

