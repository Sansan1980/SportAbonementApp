package com.danilov.sport_abonement_app.service.mappers;

import com.danilov.sport_abonement_app.model.Customer;
import com.danilov.sport_abonement_app.model.dto.CustomerDTO;

public class CustomerMapper {

        // Метод для преобразования Customer в CustomerDTO
        public CustomerDTO toDTO(Customer customer) {
            if (customer == null) {
                return null;
            }
            CustomerDTO dto = new CustomerDTO();
            dto.setCustomerId(customer.getCustomerId());
            dto.setName(customer.getName());
            dto.setSurname(customer.getSurname());
            dto.setNumberTelephone(customer.getNumberTelephone());
            return dto;
        }

        // Метод для преобразования CustomerDTO в Customer
        public Customer customerToEntity(CustomerDTO dto) {
            if (dto == null) {
                return null;
            }
            Customer customer = new Customer();// исправить взять кустомер из мапы по id или key
            customer.setName(dto.getName());
            customer.setSurname(dto.getSurname());
            customer.setNumberTelephone(dto.getNumberTelephone());
            return customer;
        }
    }


