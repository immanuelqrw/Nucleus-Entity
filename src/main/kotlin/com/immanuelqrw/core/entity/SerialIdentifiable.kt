package com.immanuelqrw.core.entity

/**
 * Interface specifying required field to be identifiable
 *
 * @property id Unique identifier for entity
 */
interface SerialIdentifiable : Identifiable {
    var id: Long?
}
