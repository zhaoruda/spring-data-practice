package com.springdata.practice.repository.pagingAndSortingRepository;

import com.springdata.practice.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User, Long> {
}
