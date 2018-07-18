package io.sphere.sdk.cartdiscounts.expansion;

import io.sphere.sdk.expansion.ExpansionModelImpl;
import io.sphere.sdk.expansion.ExpansionPathContainer;
import io.sphere.sdk.products.expansion.CustomExpansionModel;
import io.sphere.sdk.products.expansion.CustomExpansionModelImpl;

import javax.annotation.Nullable;
import java.util.List;

final class CartDiscountExpansionModelImpl<T> extends ExpansionModelImpl<T> implements CartDiscountExpansionModel<T> {

    CartDiscountExpansionModelImpl() {
    }

    CartDiscountExpansionModelImpl(@Nullable final List<String> parentPaths, @Nullable final String path) {
        super(parentPaths, path);
    }

    @Override
    public ExpansionPathContainer<T> references() {
        return expansionPath("references[*]");
    }

    @Override
    public CustomExpansionModel<T> custom() {
        return new CustomExpansionModelImpl<>(pathExpression(), "custom");
    }
}
