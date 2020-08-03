package com.immanuelqrw.core.entity

import java.time.LocalDateTime

/**
 * Interface specifying required fields needed to be an entry
 *
 * @property createdOn When entity's entry was created
 * @property modifiedOn When entity's entry was last modified
 * @property removedOn When entity's entry was removed
 */
interface Entryable {
    val createdOn: LocalDateTime?
    val modifiedOn: LocalDateTime?
    var removedOn: LocalDateTime?
}
