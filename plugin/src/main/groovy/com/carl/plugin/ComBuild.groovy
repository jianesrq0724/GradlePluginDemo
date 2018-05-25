package com.carl.plugin;

import org.gradle.api.Plugin
import org.gradle.api.Project

class ComBuild implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("Hello Plugins")
    }
}