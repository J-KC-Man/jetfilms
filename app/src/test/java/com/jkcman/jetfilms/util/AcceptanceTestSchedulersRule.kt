package com.jkcman.jetfilms.util

import io.reactivex.schedulers.Schedulers
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class AcceptanceTestSchedulersRule : TestRule {

    private val immediate = Schedulers.trampoline()


    override fun apply(base: Statement?, description: Description?): Statement {
    }
}