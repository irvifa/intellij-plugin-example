package com.github.irvifa.intellijpluginexample.services

import com.intellij.openapi.project.Project
import com.github.irvifa.intellijpluginexample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
