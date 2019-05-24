package com.immanuelqrw.core.entity

import java.util.*

/**
 * Interface specifying required field to be identifiable
 *
 * @property id Unique identifier for entity
 */
interface UniqueIdentifiable : Identifiable {
    var id: UUID?
}
