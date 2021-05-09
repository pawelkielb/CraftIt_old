package org.craftit.api.resources.commands.argument_parsers

import org.craftit.api.resources.commands.CommandIssuer

fun interface ArgumentParser<T> {
    fun parse(iterator: CharIterator, commandIssuer: CommandIssuer): T
}
