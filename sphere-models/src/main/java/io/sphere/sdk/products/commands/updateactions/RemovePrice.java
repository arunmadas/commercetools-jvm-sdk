package io.sphere.sdk.products.commands.updateactions;

import io.sphere.sdk.commands.UpdateAction;
import io.sphere.sdk.products.Price;
import io.sphere.sdk.products.Product;

import java.util.Optional;

/**
 *
 * {@include.example io.sphere.sdk.products.commands.ProductUpdateCommandTest#removePrice()}
 */
public class RemovePrice extends UpdateAction<Product> {
    private final String priceId;

    private RemovePrice(final String priceId) {
        super("removePrice");
        this.priceId = priceId;
    }

    public String getPriceId() {
        return priceId;
    }

    /**
     * Action to remove a price
     * @param price the price to remove including an ID
     * @return action
     */
    public static RemovePrice of(final Price price) {
        return of(Optional.ofNullable(price.getId()).orElseThrow(() -> new IllegalArgumentException("Expected price with ID.")));
    }

    public static RemovePrice of(final String priceId) {
        return new RemovePrice(priceId);
    }
}
