package BackEnd.service;

import BackEnd.model.Publishers;

public interface IPublishersService extends IGeneralService<Publishers> {
    Boolean existsByIdPublisher(Long idPublishers);
}
