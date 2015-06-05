package io.sphere.sdk.carts.queries;

import com.fasterxml.jackson.core.type.TypeReference;
import io.sphere.sdk.carts.Cart;
import io.sphere.sdk.carts.expansion.CartExpansionModel;
import io.sphere.sdk.queries.PagedQueryResult;
import io.sphere.sdk.queries.MetaModelQueryDsl;

/**

 {@doc.gen summary carts}

 */
public interface CartQuery extends MetaModelQueryDsl<Cart, CartQuery, CartQueryModel<Cart>, CartExpansionModel<Cart>> {
    static TypeReference<PagedQueryResult<Cart>> resultTypeReference() {
        return new TypeReference<PagedQueryResult<Cart>>(){
            @Override
            public String toString() {
                return "TypeReference<PagedQueryResult<Cart>>";
            }
        };
    }

    static CartQuery of() {
        return new CartQueryImpl();
    }
}
