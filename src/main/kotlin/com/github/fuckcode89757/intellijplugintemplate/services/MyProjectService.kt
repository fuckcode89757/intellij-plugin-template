package com.github.fuckcode89757.intellijplugintemplate.services

import com.github.fuckcode89757.intellijplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
