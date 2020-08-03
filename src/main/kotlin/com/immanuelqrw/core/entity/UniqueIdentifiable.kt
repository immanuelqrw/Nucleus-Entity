package com.immanuelqrw.core.entity

import java.util.UUID

/**
 * Interface specifying required field to be identifiable
 *
 * @property id Unique identifier for entity
 */
interface UniqueIdentifiable : Identifiable {

    var _id: UUID?

    val id: UUID

}
