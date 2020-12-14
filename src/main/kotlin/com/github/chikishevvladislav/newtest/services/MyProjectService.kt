package com.github.chikishevvladislav.newtest.services

import com.intellij.openapi.project.Project
import com.github.chikishevvladislav.newtest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
