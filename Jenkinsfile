pipeline {
  agent any
  stages {
    stage('Step1') {
      steps {
        findbugs(canComputeNew: true, canResolveRelativePaths: true, canRunOnFailed: true, shouldDetectModules: true, useDeltaValues: true, usePreviousBuildAsReference: true, useStableBuildAsReference: true, isRankActivated: true)
      }
    }
  }
}