package magiccards.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import magiccards.entities.Extension;

public interface ExtensionRepository extends PagingAndSortingRepository<Extension,String> {
}