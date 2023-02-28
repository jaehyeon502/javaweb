import React from "react";

import { Box, Avatar, Typography } from "@mui/material";

import { ILikeUser } from "src/interface";

interface Props {
    likeUser: ILikeUser
}

export default function LikeListItem({ likeUser } : Props) {
  return (
    <Box component="span" sx={{ display: "inline-flex", alignItems: "center", mr:'30px' }}>
      <Avatar component="span" sx={{ width: "32px", height: "32px", mr: "8px" }} src={likeUser.likeUserProfile} />
      <Typography component="span" sx={{ fontSize: "16px", fontWeight: "500" }}>{likeUser.likeUserNickname}</Typography>
    </Box>
  );
}
