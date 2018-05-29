package com.carl.plugin_first

import com.carl.plugin_first.exten.ComExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class FirstPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('combuild', ComExtension)
        System.out.println("Hello First Plugin")


    }
}