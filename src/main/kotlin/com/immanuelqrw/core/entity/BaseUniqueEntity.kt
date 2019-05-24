package com.immanuelqrw.core.entity

import com.immanuelqrw.core.util.DateTimeFormatter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

/**
 * Abstract class for the base of an entity
 *
 * @property id Unique identifier for entity
 * @property createdOn When entity's entry was created
 * @property modifiedOn When entity's entry was last modified
 * @property removedOn When entity's entry was removed
 */
@MappedSuperclass
abstract class BaseUniqueEntity : UniqueEntityable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`")
    override var id: UUID? = null

    @DateTimeFormat(pattern = DateTimeFormatter.DATE_TIME_PATTERN)
    @CreatedDate
    @CreationTimestamp
    @Column(name = "`createdOn`", updatable = false)
    override var createdOn: LocalDateTime? = null

    @DateTimeFormat(pattern = DateTimeFormatter.DATE_TIME_PATTERN)
    @LastModifiedDate
    @UpdateTimestamp
    @Column(name = "`modifiedOn`")
    override var modifiedOn: LocalDateTime? = null

    @DateTimeFormat(pattern = DateTimeFormatter.DATE_TIME_PATTERN)
    @Column(name = "`removedOn`")
    override var removedOn: LocalDateTime? = null
}
