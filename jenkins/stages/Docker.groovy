/* Stage for build docker image
 */
def BuildImage(String project, String version, String stageName='') {
    stage(stageName ? stageName : 'Build Image') {
        dir(project) {
            String comm
            println('Build Image... ')

            comm = """docker build -t ${project}:${version} . \\
                    |docker tag ${project}:${version} vadimtailor/${project}:${version} \\
                    |docker push vadimtailor/${project}:${version} \\
                    |sed -i 's/image-tag/${version}/g' ${project}/values.yaml""".stripMargin()
            sh(comm)
        }
    }
}