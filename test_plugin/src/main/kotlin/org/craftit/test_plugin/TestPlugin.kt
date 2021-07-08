package org.craftit.test_plugin

import org.craftit.api.CraftIt
import org.craftit.api.resources.plugin.Plugin
import org.craftit.test_plugin.commands.Counter
import org.craftit.test_plugin.commands.Heal
import org.craftit.test_plugin.commands.HelloWorld
import org.craftit.test_plugin.commands.Test

class TestPlugin(craftIt: CraftIt) : Plugin by craftIt.plugin(
    commands = {
        "hello_world" { HelloWorld(it, craftIt) }
        "heal" { Heal(it, craftIt) }
        "counter" { Counter(it, craftIt) }
        "test" { Test(it, craftIt) }
    }
)
