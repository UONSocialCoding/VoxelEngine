package com.uonsocialcoding.voxelengine

import mu.KLogger
import mu.KotlinLogging
import org.lwjgl.Version

private val logger: KLogger = KotlinLogging.logger { }


/**
 * Main entry point for the engine
 *
 * @param args Command line arguments.
 */
fun main(args: Array<String>) {
    logger.info { "LWGL ${Version.getVersion()}" }
}