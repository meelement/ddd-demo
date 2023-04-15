package com.raderleao.admin.catalogo.application.category.delete;

import com.raderleao.admin.catalogo.domain.category.CategoryGateway;
import com.raderleao.admin.catalogo.domain.category.CategoryID;

public class DefaultDeleteCategoryUseCase extends DeleteCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultDeleteCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public void execute(final String anIn) {
        this.categoryGateway.deleteById(
                CategoryID.from(anIn));
    }
}
