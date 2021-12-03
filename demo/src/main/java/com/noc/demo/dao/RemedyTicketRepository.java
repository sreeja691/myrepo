package com.noc.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noc.demo.entity.RemedyTicketModel;


public interface RemedyTicketRepository extends JpaRepository < RemedyTicketModel, Long > {
}
