#!/usr/bin/env groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo config.name
    echo "Param0 is: ${env.param0}"
    echo "Param1 is: ${env.param1}"
    echo "Param2 is: ${env.oarms2}"
    if (env.param0 == 'One default') {
        echo "Param0 is default"
    }
    return this
}