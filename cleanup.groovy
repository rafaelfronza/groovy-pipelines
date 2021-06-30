// filtrar por branch que ja foi mergeada (mes atual) e excluir (incluir hotfix/ bugfix/ feature/)
// filtrar por branch que esta sem commit a mais de 3 meses (mes atual -1) (excluir hotfix/ bugfix/ feature/)
// --> filtrar hotfix/ bugfix/ feature/ que ja foram mergeadas (mes atual -1) e excluir

def REPOSITORIES = [
    // place in this list your repositories you want to manage
    ['ssh://git@github.com:', 'rafaelfronza/groovy-pipelines.git']
    //['ssh://git@<your git>.com:', '<your user>/<repository>.git'],
    //['ssh://git@<your git>.com:', '<your user>/<repository>.git']
    // this is a list!
]

pipeline {
    agent {
        node {
            label '<your node>'
        }
    }

    // parameters {
        // No need parameters in this one!
    // }

    // tools {
        // No need tools in this one!
    // }

    environment {
        
    }
}