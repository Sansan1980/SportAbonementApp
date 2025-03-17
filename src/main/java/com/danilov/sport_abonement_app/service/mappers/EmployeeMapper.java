package com.danilov.sport_abonement_app.service.mappers;

import com.danilov.sport_abonement_app.model.Employee;
import com.danilov.sport_abonement_app.model.dto.EmployeeDTO;

public class EmployeeMapper {

    public EmployeeDTO toDTO(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeId(employee.getEmployeeId());
        dto.setName(employee.getName());
        dto.setSurname(employee.getSurname());
        dto.setNumberTelephone(employee.getNumberTelephone());
        return dto;
    }

    public Employee employeeToEntity(EmployeeDTO dto) {
        if (dto == null) {
            return null;
        }
        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setSurname(dto.getSurname());
        employee.setNumberTelephone(dto.getNumberTelephone());
        return employee;
    }
}
