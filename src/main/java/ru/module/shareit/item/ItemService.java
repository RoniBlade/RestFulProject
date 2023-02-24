package ru.module.shareit.item;

import ru.module.shareit.item.dto.ItemDto;

import java.util.List;

public interface ItemService {
    ItemDto addItem(Long ownerId, ItemDto item);

    ItemDto updateItem(Long userId, ItemDto item);

    ItemDto getItemById(Long itemId);

    List<ItemDto> getUserItems(Long userId);

    List<ItemDto> searchItemByText(String search);
}
