package BackEnd.service;

import BackEnd.model.Authors;

public interface IAuthorsService extends IGeneralService<Authors> {
    Boolean existsByIdAuthors(Long idAuthors);
    int getAuthorsBookCount(Long idAuthors);
}
