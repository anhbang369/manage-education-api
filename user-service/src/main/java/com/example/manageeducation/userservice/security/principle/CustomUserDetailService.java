package com.example.manageeducation.userservice.security.principle;

import com.example.manageeducation.userservice.exception.BadRequestException;
import com.example.manageeducation.userservice.model.Customer;
import com.example.manageeducation.userservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    @Transactional
    @Cacheable(value = "userDetails")
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerRepository.findByEmail(username).orElseThrow(() -> new BadRequestException(username +"Not found!"));
        return CustomerPrinciple.build(customer);
    }
}
