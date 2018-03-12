package com.devicemanager.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devicemanager.main.model.EnrollDevice;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */

@Repository
public interface EnrollDeviceRepository extends JpaRepository<EnrollDevice, Long> {

}
