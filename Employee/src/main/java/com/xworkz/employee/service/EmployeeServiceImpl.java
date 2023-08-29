package com.xworkz.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.repo.EmployeeRepo;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public boolean save(EmployeeDto dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getName() != null && dto.getName().length() >= 3 && dto.getName().length() < 20) {
					if (dto.getPosition() != null) {
						if (dto.getJoingDate() != null) {
							if (dto.getExperience() > 3) {
								if (dto.getAddress() != null && dto.getAddress().length() > 5) {
									if (dto.getQualification() != null) {
										if (dto.getAge() >= 21) {
											if (dto.getGender() != null) {
												if (dto.getContactNo() != null) {
													System.out.println("Data is validated");
													repo.save(dto);
													return true;

												}
												System.out.println("ContactNumber is not valid");
												return false;
											}
											System.out.println("Gender is null");
											return false;
										}
										System.out.println("Age must be greater than 20");
										return false;
									}
									System.out.println("Qualification is blank");
									return false;
								}
								System.out.println("Address is not valid");
								return false;
							}
							System.out.println("Experiance is not valid");
							return false;
						}
						System.out.println("Joining Date not valid");
						return false;
					}
					System.out.println("Position is null");
					return false;
				}
				System.out.println("Name is not valid");
				return false;
			}
			System.out.println("Id Should be greater than 0");
			return false;
		}
		System.out.println("Dto is null so not valid");
		return false;

	}

	@Override
	public EmployeeDto findById(int id) {
		if (id > 0) {
			System.out.println("id is validated");
			return repo.findById(id);
		}
		System.out.println("id is not valid");
		return null;
	}

	@Override
	public EmployeeDto findByIdAndName(int id, String name) {
		if (id > 0) {
			if (name != null && name.length() > 3) {
				System.out.println("Name is valid");
				return repo.findByIdAndName(id, name);
			}
			System.out.println("Name is not valid");
			return null;
		}
		System.out.println("Id is not valid");
		return null;
	}

	@Override
	public boolean updateExperianceByName(float exp, String name) {
		if (exp > 0) {
			if (name != null && name.length() > 3) {
				System.out.println("Data is validated");
				return repo.updateExperianceByName(exp, name);
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("Experiance is not valid");
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		if (name != null && name.length() > 3) {
			System.out.println("Name is valid");
			return repo.deleteByName(name);

		}
		System.out.println("Name is not valid");
		return false;
	}

	@Override
	public List<EmployeeDto> readAll() {

		return repo.readAll();
	}

	@Override
	public boolean updateExpAndPositionByNameAndId(float exp, String position, String name,int id) {
		if (exp > 5) {
			if (position != null) {
				if (name != null && name.length() > 3) {
					System.out.println("Data is validated");
					return repo.updateExpAndPositionByNameAndId(exp, position, name, id);
				}
				System.out.println("Name is not valid");
				return false;
			}
			System.out.println("Position is not valid");
			return false;
		}
		System.out.println("exp is not valid");
		return false;
	}

	@Override
	public boolean deleteByNameAndId(int id, String name) {
		if(id>0) {
			if(name!=null && name.length()>3) {
				System.out.println("Data is validated");
				return repo.deleteByNameAndId(id,name);
			}
			System.out.println("name is not valid");
			return false;
		}
		System.out.println("id is not valid");
		return false;
	}

}
